<template>
  <div>
    <el-row>
      <el-col :offset="2" :span="20">
        <el-table :data="tableData" stripe style="width: 100%">
          <el-table-column prop="uid" label="UID" width="180" />
          <el-table-column prop="username" label="Username" width="180" />
          <el-table-column prop="type" label="Type" width="180" />
          <el-table-column prop="email" label="Email" width="180" />

          <el-table-column label="Operation">
            <template v-slot="scope">
              <el-button type="primary" @click="$store.commit('setTargetUserInfo', scope.row); $router.push('/users/edit')">Edit</el-button>
              <el-button type="danger" @click="deleteUser(scope.row)">Delete</el-button>
            </template>
          </el-table-column>


        </el-table>

      </el-col>
    </el-row>

  </div>

</template>


<script>
import axios from "axios";
import {config} from "../../assets/js/config.js";

export default {
  name: "UserManagement",
  data() {
    return{
      userTypes: ["admin","seller","buyer","visitor"],
      tableData : [
        {
          uid: 1,
          username: 'Tomson',
          email: 'tomson224@gmail.com',
          type: 'Administrator'
        },
        {
          uid: 2,
          username: 'Tomson',
          email: 'tomson224@gmail.com',
          type: 'Seller'
        },
        {
          uid: 3,
          username: 'Tomson',
          email: 'tomson224@gmail.com',
          type: 'Buyer'
        },
        {
          uid: 4,
          username: 'Tomson',
          email: 'tomson224@gmail.com',
          type: 'Visitor'
        },
      ]
    }
  },
  methods: {
    deleteUser(scope) {
      console.log(scope)
    }
  }
  ,
  mounted() {
    let _this = this;
    console.log("xxxx")
    axios.get(config.$api_url+"/api/users/all").then(function (response) {
      console.log(response.data);
      if (response.data.statusCode !== 200){
        _this.$message.error(response.data.message);
      }else{
        _this.tableData = response.data.data;
        console.log(response.data.data)
        console.log(666)
      }
    }).catch(function (error) {
      console.log(error);
      if (error.response) {
        console.log(error);
      }
      console.log( error.config );
    })
  }
}
</script>

<style scoped>

</style>