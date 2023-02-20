<script lang="ts" setup xmlns:el-col="http://www.w3.org/1999/html">
import useImageUrl from '../utils/useImageUrl'
import usePubImageUrl from "../utils/usePubImageUrl";
import {ref} from "vue";
import imgUrl from '../../public/views/homePage/aston-martin-g0983ba8cb_1920.jpg';
import imgUrl2 from '../assets/vue.svg';

const carousels_pics = ref([
    "/views/homePage/businessmen-greeting-by-shaking-hands.jpg",
    "/views/homePage/aston-martin-g0983ba8cb_1920.jpg",
    "/views/homePage/customer-service.png",
    "/views/homePage/mercedes-benz-g7e06f955a_1920.png",

  // usePubImageUrl('homePage', 'aston-martin-g0983ba8cb_1920', 'jpg'),
  // usePubImageUrl('homePage', 'aston-martin-usePubImageUrl(\'homePage\', \'aston-martin-g0983ba8cb_1920\', \'jpg\'),', 'jpg'),
  // usePubImageUrl('homePage', 'aston-martin-g0983ba8cb_1920', 'jpg'),
  // usePubImageUrl('homePage', 'aston-martin-g0983ba8cb_1920', 'jpg'),
])
console.log(111)

</script>
<template>
  <div class="main">
<!--    &lt;!&ndash;  welcome  &ndash;&gt;-->
<!--    <div class="welcome">-->
<!--      <h1 style="font-size: 60px">Welcome to SH Auto Mall</h1>-->
<!--    </div>-->

    <!--  carousel  -->
<!--    <div class="block text-center carousel">-->
<!--      <el-carousel height="600px" indicator-position="outside" >-->
<!--        <el-carousel-item v-for="item in 4" :key="item">-->
<!--          <img class="carousels-pic" :src="carousels_pics[item-1]" alt="Image Missing">-->
<!--        </el-carousel-item>-->
<!--      </el-carousel>-->
<!--    </div>-->

    <!--  Product Advantage  -->
    <hr>
    <div style=" background-color: #B3B7B8">
      <p style="text-align: center; font-size: 40px; font-weight: bolder;">
        {{ $t("home.advantage.why-choose-us") }}
      </p>

      <el-row>
        <el-col :span="6" style="background-color: #D0D0D0">
          <el-row>
            <el-col :span="24" class="advantage-name">
              {{ $t("home.advantage.advantage-1") }}
            </el-col>
          </el-row>
          <el-row>
            <el-col :span="20" :offset="2" class="advantage-description">
              {{ $t("home.advantage.advantage-1-description") }}
            </el-col>
          </el-row>
        </el-col>
        <el-col :span="6" style="background-color: #E5E5E5">
          <el-row>
            <el-col :span="24" class="advantage-name">
              {{ $t("home.advantage.advantage-2") }}
            </el-col>
          </el-row>
          <el-row>
            <el-col :span="20" :offset="2" class="advantage-description">
              {{ $t("home.advantage.advantage-2-description") }}
            </el-col>
          </el-row>
        </el-col>
        <el-col :span="6" style="background-color: #D0D0D0">
          <el-row>
            <el-col :span="24" class="advantage-name">
              {{ $t("home.advantage.advantage-3") }}
            </el-col>
          </el-row>
          <el-row>
            <el-col :span="20" :offset="2" class="advantage-description">
              {{ $t("home.advantage.advantage-3-description") }}
            </el-col>
          </el-row>
        </el-col>
        <el-col :span="6" style="background-color: #E5E5E5">
          <el-row>
            <el-col :span="24" class="advantage-name">
              {{ $t("home.advantage.advantage-4") }}
            </el-col>
          </el-row>
          <el-row>
            <el-col :span="20" :offset="2" class="advantage-description">
              {{ $t("home.advantage.advantage-4-description") }}
            </el-col>
          </el-row>
        </el-col>
      </el-row>
    </div>


    <div class="user-entry">
      <el-row style="text-align: center; margin-top: 7%">
        <el-col :span="12">
          <div>
            <el-button style="width: 80%; margin: 0 auto; height: 250px; border-radius: 30px; font-size: 60px; background-color: #FFC0CB" @click="$router.push('/mall')">
              {{ $t("home.user-entry.buyer.label") }}
              <img src="/views/homePage/car.png" alt="car icon">
            </el-button>
          </div>
          <div @click="$store.commit('setLoginDialogVisible', {visible:true})">
            <el-button type="info" >
              {{ $t("home.user-entry.buyer.login-register") }}
            </el-button>
          </div>

        </el-col>
        <el-col :span="12">
          <div>
            <el-button style="width: 80%; margin: 0 auto; height: 250px; border-radius: 30px; font-size: 60px; background-color: #7FC64F" @click="$router.push('/sell-car')">
              {{ $t("home.user-entry.seller.label") }}
              <img src="/views/homePage/shop.png" alt="shop icon">
            </el-button>
          </div>

          <div @click="$store.commit('setLoginDialogVisible', {visible:true})">
            <el-button type="info" >
              {{ $t("home.user-entry.seller.login-register") }}
            </el-button>
          </div>

        </el-col>
      </el-row>



    </div>

    <!--  Embedded video  -->
    <div style="margin-top: 30px">
      <el-row>
        <el-col :span="6" style="text-align: center">
          <iframe style="width: 90%; margin: 0 auto" src="//player.bilibili.com/player.html?aid=217400728&bvid=BV1sa411G74U&cid=815772641&page=1" scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true"> </iframe>
        </el-col>
        <el-col :span="6" style="text-align: center">
          <iframe style="width: 90%; margin: 0 auto" src="//player.bilibili.com/player.html?aid=217400728&bvid=BV1sa411G74U&cid=815772641&page=1" scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true"> </iframe>
        </el-col>
        <el-col :span="6" style="text-align: center">
          <iframe style="width: 90%; margin: 0 auto" src="//player.bilibili.com/player.html?aid=217400728&bvid=BV1sa411G74U&cid=815772641&page=1" scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true"> </iframe>
        </el-col>
        <el-col :span="6" style="text-align: center">
          <iframe style="width: 90%; margin: 0 auto" src="//player.bilibili.com/player.html?aid=217400728&bvid=BV1sa411G74U&cid=815772641&page=1" scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true"> </iframe>
        </el-col>

      </el-row>
    </div>
  </div>

  <div>

  </div>
</template>

<style scoped>
*{

}

.main {
  width: 100%;
  height: 100%;
}

.carousels-pic {
  width: 100%;
  margin:0 auto
}

.carousel{
  position: relative;
  margin:0 auto;
  width: 100%;
  border-radius: 10px;
  background-color: #313335;
}

.el-carousel__container {
  width: 100%;
}

.welcome {
  width: 1080px;
  alignment: center;
  /*position: absolute;*/
}

.welcome h1 {
  text-align: center;
  position: absolute;
  z-index: 1;
  background-color: transparent;
  right: 0;
  left: 0;
  top: 100px;
  text-shadow:#FFF 1px 0 0,#FFF 0 1px 0,#FFF -1px 0 0,#FFF 0 -1px 0;
}

.login {
  position: fixed;
  z-index: 1;
  right: 20px;
}

.login span {
  font-size: 40px;
}

.login-button {
  height: 150px;
  border: 4px solid #475669;
  border-radius: 15px;

}

.advantage-name {
  padding: 5px;
  font-size: 20px;
  font-weight: bold;
  text-align: center;
}

.advantage-description {
  padding: 2px;
  text-align: center;
  color: #61666D;
}

</style>
