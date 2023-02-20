<template>
  <div style="margin: 5% 0 0 1%">
    <div class="search-record">
      <SearchResultRow
          v-for="item in 3"
          :data="searchResultList[item-1]"
          :key="item.id"

      />
    </div>

    <div class="search-record">
      <SearchResultRow
          v-for="item in searchResultList.length-3"
          :data="searchResultList[item+2]"
          :key="item.id"
          v-show="$store.state.userInfo.userType !== 3"
      />
    </div>


    <!--    <el-table :data="tableData" style="width: 100%" border>-->
    <!--      <el-table-column label="My ListAlarm" />-->
    <!--      <el-table-column prop="image" label="Image">-->
    <!--        <template #default="scope">-->
    <!--          <img :src="scope.row.image" />-->
    <!--        </template>-->
    <!--      </el-table-column>-->
    <!--      <el-table-column prop="model" label="Model" />-->
    <!--      <el-table-column prop="grade" label="Grade" />-->
    <!--      <el-table-column prop="auctionSite" label="Auction Site" />-->
    <!--      <el-table-column prop="location" label="Location" />-->
    <!--      <el-table-column prop="lotNo" label="Lot No." />-->
    <!--      <el-table-column prop="year" label="Year" />-->
    <!--      <el-table-column prop="type" label="Type" />-->
    <!--      <el-table-column prop="inspect" label="Inspect" />-->
    <!--      <el-table-column prop="color" label="Color" />-->
    <!--      <el-table-column prop="tm" label="T/M" />-->
    <!--      <el-table-column prop="score" label="Score" />-->
    <!--      <el-table-column prop="startPrice" label="Start Price" />-->
    <!--      <el-table-column prop="startDate" label="Start" />-->
    <!--    </el-table>-->
  </div>

<!--  <div v-show="promptVisible">-->
  <div style="text-align: center; font-size: 40px; margin: 35px auto; width: 70%" v-show="$store.state.userInfo.userType === 3">

    <span>Visitors can only see 3 vehicles, to access more please
      <a href="javascript:void(0)" @click="$store.commit('setLoginDialogVisible', {visible:true})">login your account</a>
    </span>
  </div>

</template>

<script>
import SearchResultRow from "./components/SearchResultRow.vue";
import searchResultRow from "./components/SearchResultRow.vue";
import axios from "axios";
import {config} from "../../assets/js/config.js";
export default {
  name: "SearchResult",
  props: ["aac"],
  methods: {
  },
  components: { SearchResultRow },
  data() {
    return {
      showNumber: 3,
      isRealData: false,
      searchResultList: [
        {
          id: 1,
          image: "/car.jpg",
          model: "AQUA",
          grade: "S",
          auctionSite: "AUCNET",
          location: "Toyama",
          lotNo: "10048",
          year: "2013",
          type: "NHP10",
          cc: "1500cc",
          inspect: "Dec.2025",
          odo: "47000km",
          color: "P",
          colorNo: "1G3",
          tm: "FAT",
          ac: "AC",
          score: "4",
          extInt: "C B",
          startPrice: "150,000",
          startDate: "Jan 16",
          startTime: "10:50",
          method: 0
        },
        {
          id: 2,
          image: "/car.jpg",
          model: "AQUA",
          grade: "S",
          auctionSite: "AUCNET",
          location: "Toyama",
          lotNo: "10048",
          year: "2013",
          type: "NHP10",
          cc: "1500cc",
          inspect: "Dec.2025",
          odo: "47000km",
          color: "P",
          colorNo: "1G3",
          tm: "FAT",
          ac: "AC",
          score: "4",
          extInt: "C B",
          startPrice: "150,000",
          startDate: "Jan 16",
          startTime: "10:50",
          method: 1
        },
        {
          id: 3,
          image: "/car.jpg",
          model: "AQUA",
          grade: "S",
          auctionSite: "AUCNET",
          location: "Toyama",
          lotNo: "10048",
          year: "2013",
          type: "NHP10",
          cc: "1500cc",
          inspect: "Dec.2025",
          odo: "47000km",
          color: "P",
          colorNo: "1G3",
          tm: "FAT",
          ac: "AC",
          score: "4",
          extInt: "C B",
          startPrice: "150,000",
          startDate: "Jan 16",
          startTime: "10:50",
          method: 2
        },
        {
          id: 4,
          image: "/car.jpg",
          model: "AQUA",
          grade: "S",
          auctionSite: "AUCNET",
          location: "Toyama",
          lotNo: "10048",
          year: "2013",
          type: "NHP10",
          cc: "1500cc",
          inspect: "Dec.2025",
          odo: "47000km",
          color: "P",
          colorNo: "1G3",
          tm: "FAT",
          ac: "AC",
          score: "4",
          extInt: "C B",
          startPrice: "150,000",
          startDate: "Jan 16",
          startTime: "10:50",
          method: 1
        },
        {
          id: 5,
          image: "/car.jpg",
          model: "AQUA",
          grade: "S",
          auctionSite: "AUCNET",
          location: "Toyama",
          lotNo: "10048",
          year: "2013",
          type: "NHP10",
          cc: "1500cc",
          inspect: "Dec.2025",
          odo: "47000km",
          color: "P",
          colorNo: "1G3",
          tm: "FAT",
          ac: "AC",
          score: "4",
          extInt: "C B",
          startPrice: "150,000",
          startDate: "Jan 16",
          startTime: "10:50",
          method: 2
        },
      ],
    };
  },
  beforeCreate() {
    console.log("11132")
    console.log(this.$store.state.userType)
    if (this.$store.state.userType !== 3) {
      this.showNumber = this.searchResultList.length;
    }

    console.log(113);
    let _this = this;
    axios.get(config.$api_url+"/api/selling/all").then(function (response) {
      //if login failed, show alert
      console.log(response.data);
      if (response.data.statusCode !== 200){
        _this.$message.error(response.data.message);
      }else{
        _this.$message.success({message: "get data successfully!", showClose: true, duration: 1400});
        _this.searchResultList = response.data.data;
        console.log(_this.searchResultList)
      }
    }).catch(function (error) {
      console.log(error);
      if (error.response) {
        console.log(error);
      }
      console.log( error.config );
    })

    const time = new Date().getTime()
    while (!this.isRealData && new Date().getTime() < time+5000);
    //
    // for (let i = 0; i < 3; i++) {
    //   console.log("----"+i)
    //   if (this.searchResultList[i].method === 1) {
    //     console.log(1)
    //     document.getElementsByClassName("search-record")[i].style["backgroundColor"] = 'lightgreen'
    //   }
    //
    //   if (this.searchResultList[i].method === 2) {
    //     console.log(2)
    //     document.getElementsByClassName("search-record")[i].style["backgroundColor"] = 'lightpink'
    //   }
    // }
  }
};
</script>

<style scoped>
  .bg-green {
    background: lightgreen;
  }

  .bg-pink {
    background: lightpink;
  }

</style>
