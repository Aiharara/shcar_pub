<!--<script setup lang="ts">-->
<!--import { ref } from 'vue'-->

<!--defineProps<{ isShow: boolean }>()-->

<!--const count = ref(0)-->
<!--const loginDialogVisible = ref(false)-->
<!--const isLoggedIn = ref(false)-->
<!--</script>-->

<script>
import axios from 'axios';
import {config} from "../assets/js/config";

export default {
  props:{
    language:{
      type:String, // 指定类型
      default:'EN' // 默认值
    }
  },
  data() {
    return {
      loginDialogVisible: false,
      isLogIn: true,
      isLoggedIn: false,
      loginForm: {
        email: null,
        password: null,
      }
    }
  },
  methods: {
    changeLang(lang) {
      console.log(this.$i18n.locale)
      this.$i18n.locale = lang
      console.log(this.$i18n.locale)
    },
    login() {
      console.log(113);
      let _this = this;
      axios.post(config.$api_url+"/api/users/login", this.loginForm).then(function (response) {
        //if login failed, show alert
        console.log(response.data);
        if (response.data.statusCode !== 200){
          _this.$message.error(response.data.message);
        }else{
          _this.$message.success({message: "Login successfully!", showClose: true, duration: 1400});
          console.log(_this.$store.state.userInfo)
          _this.$store.commit('setUserInfo', response.data.data)

          console.log("email:"+response.data.data.email)
          console.log(666)
          console.log(_this.$store.state.userInfo)
        }
      }).catch(function (error) {
        console.log(error);
        if (error.response) {
          console.log(error);
        }
        console.log( error.config );
      })
    }
  },
};
</script>

<template>
  <div style="width: 100%">
    <el-menu
        class="nav-bar"
        mode="horizontal"
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b"
        :ellipsis="false">
      <el-menu-item index="0" @click="$router.push('/home')">{{ $t("nav.home") }}</el-menu-item>
      <el-menu-item index="1" @click="$router.push('/mall')">{{ $t("nav.auto-mall") }}</el-menu-item>
      <el-menu-item index="2" @click="$router.push('/market-price')">{{ $t("nav.market-price") }}</el-menu-item>
      <el-menu-item index="3" @click="$router.push('/users/all')" v-show="$store.state.userInfo.userType === 0">{{ $t("nav.user-management") }}</el-menu-item>
      <el-menu-item index="5" @click="$router.push('/membership')" v-show="$store.state.userInfo.userType === 1 || $store.state.userInfo.userType === 2 ">membership</el-menu-item>
      <span class="flex-grow" style="flex-grow: 1"/>
      <el-menu-item @click="changeLang('zh-CN')">中文</el-menu-item>
      <el-menu-item @click="changeLang('en-US')">English</el-menu-item>
      <el-menu-item index="4" @click="$store.commit('setLoginDialogVisible', {visible:true})" v-show="!isLoggedIn">{{ $t("nav.login") }}</el-menu-item>



      <!--    <div style="display: flex; flex-direction: column; color: white">-->
      <!--      <span style="margin-top: 5px">-->
      <!--      Current Point Balance: 7746 P-->
      <!--      </span>-->
      <!--      <hr>-->
      <!--      <span>-->
      <!--        Points expire at the end of Dec 2024: 1200 P-->
      <!--      </span>-->
      <!--    </div>-->
    </el-menu>

    <div class="personal-info" style="position: absolute; right: 18%; top: 3%">
      <div style="zoom: 300%; float: right" class="avatar" v-show="isLoggedIn">
        <el-icon style="margin: 0 auto;position: absolute; z-index: 2; background-color:#A6A7AB; border-radius: 100%; box-shadow: #202124 1px 1px 1px 1px ; padding: 1px" >
          <Avatar/>
        </el-icon>

      </div>

      <div class="avatar-panel" style="background-color: white; position: relative; right: -20px; top: 20px;
          z-index: 1; border-radius: 5%; border: thin solid #E3E5E7;">
        <div style="display: flex; flex-direction: column; text-align: center">
          <span style=" left:30% ; font-size: 20px; margin-top: 3%">{{ $store.state.userInfo.username }}</span>
          <div style="display: flex; flex-direction: row">
            <div class="flex-grow" style="flex-grow: 1"/>
            <span style="background: linear-gradient(to right bottom, #C5CAD6, #41444E, #C5CAD6); border-radius: 5px; color: #F3F7FB; padding: 1px">platinum member</span>
            <div class="flex-grow" style="flex-grow: 1"/>
          </div>
          <span style="color: #61666D; padding: 8px">
            Current Point Balance: <span style="color: #202124">7746 P</span><br>
          </span>
          <el-menu
              mode="vertical"
              background-color="#565760"
              text-color="#fff"
              active-text-color="#ffd04b"
              style="border-radius: 5%;">
            <el-menu-item style="border-radius: 20%; " index="1" @click="$router.push('/my-account')">My Account</el-menu-item>
            <el-menu-item style="border-radius: 20%;" index="2">My Order</el-menu-item>
            <el-menu-item style="border-radius: 20%;" index="3">Transaction Progress</el-menu-item>
            <el-menu-item style="border-radius: 20%;" index="4">After-sales Service</el-menu-item>
            <el-menu-item style="border-radius: 20%; z-index: 10000" index="5">Logout</el-menu-item>
          </el-menu>

        </div>
      </div>

    </div>

    <!--  login dialog  -->
    <div>
      <el-dialog v-model="$store.state.loginDialogVisible" style="width: 25%; display: flex; flex-direction: column; text-align: center">
        <el-row v-if="isLogIn">
          <el-col :offset="4" :span="16">
            <div style="font-size: 15px;">Sign in with your email and password</div>
            <div style="text-align: left; padding-top: 5px; font-weight: bold">Email</div>
            <input type="text" style="width: 100%; height: 20px" placeholder="name@host.com" v-model="loginForm.email"/>
            <div style="text-align: left; padding-top: 5px; font-weight: bold">Password</div>
            <input type="text" style="width: 100%; height: 20px" placeholder="Password" v-model="loginForm.password"/>
            <div style="text-align: left; padding-top: 5px; margin-bottom: 15px">
              <a href="">Forgot your password?</a>
            </div>
            <div>
              <el-button style="width: 100%; margin-top: 7px" color="red" @click="isLoggedIn = true; $store.commit('setLoginDialogVisible', {visible:false}); login()">
                Sign in
              </el-button>
            </div>
            <span>
              Need an account? <a href="#" @click="isLogIn = false">Sign up</a>
            </span>
          </el-col>
        </el-row>

        <el-row v-if="!isLogIn">
          <el-col :offset="4" :span="16">
            <div style="font-size: 15px;">Sign up a new account</div>
            <div style="text-align: left; padding-top: 15px; font-weight: bold">Username</div>
            <input type="text" style="width: 100%; height: 20px" placeholder="Username"/>
            <div style="text-align: left; padding-top: 5px; font-weight: bold">Email</div>
            <input type="text" style="width: 100%; height: 20px" placeholder="name@host.com"/>
            <div style="text-align: left; padding-top: 5px; font-weight: bold">Password</div>
            <input type="text" style="width: 100%; height: 20px" placeholder="Password"/>
            <div>
              <el-button style="width: 100%; margin-top: 12px" color="red" @click="isLoggedIn = true; $store.commit('setLoginDialogVisible', {visible:false})">
                Sign up
              </el-button>
            </div>
            <span>
              Have an account? <a href="#" @click="isLogIn = true">Sign in</a>
            </span>
          </el-col>
        </el-row>

      </el-dialog>
    </div>
  </div>


</template>

<style scoped>
.nav-bar {
  box-shadow: rgba(0, 0, 0, 0.15) 0 2px 5px;
  position: relative;
  top: 0;
  left: 0;
  width: 100%;
  height: 6%;
}

/*.avatar :hover{*/
/*  zoom: 200%;*/
/*}*/

.avatar-panel {
  z-index: 10;
  display: none;
}

/*.avatar:hover + .avatar-panel{*/
/*  display: block;*/

/*}*/

/*.avatar-panel:hover {*/
/*  display: block;*/
/*}*/

.personal-info:hover .avatar{
  zoom:200%
}

.personal-info:hover .avatar-panel{
  display: block;
}



</style>
