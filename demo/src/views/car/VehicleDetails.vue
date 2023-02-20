<script>
import {ref} from "vue";

export default {
  name: "VehicleDetails",
  data() {
    return {
      carousels_pics : [
        "/views/homePage/mercedes-benz-g7e06f955a_1920.png",
        "/views/homePage/mercedes-benz-g7e06f955a_1920.png",
        "/views/homePage/mercedes-benz-g7e06f955a_1920.png",
        "/views/homePage/mercedes-benz-g7e06f955a_1920.png",
      ],
      vehicle : {
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
        tm: "T",
        ac: "AC",
        score: "4",
        extInt: "C B",
        startPrice: "150,000",
        startDate: "Jan 16",
        startTime: "10:50",
      }
    }
  }
}
</script>

<template>
  <div class="main">
    <el-row>
      <el-col :span="11" :offset="1">
        <!--  carousel  -->
        <div class="block text-center carousel">
          <el-carousel height="280px" indicator-position="outside" >
            <el-carousel-item v-for="item in 4" :key="item">
              <img class="carousels-pic" :src="carousels_pics[item-1]" alt="Image Missing">
            </el-carousel-item>
          </el-carousel>
        </div>
      </el-col>
      <el-col :span="1"></el-col>
      <el-col :span="10">
        <div class="fundamental-detail">
          <span v-text="vehicle.model" style="font-size: 25px"></span>
          <div class="price">
            <span>Price</span>
            <span v-text="vehicle.startPrice" style="color: orange; font-size: 50px"></span>
          </div>

          <div class="other-info">
            <div class="info">
              <span v-text="vehicle.odo"></span>
              <div>Odo</div>
            </div>

            <div class="info">
              <span v-text="vehicle.grade"></span>
              <div>Grade</div>
            </div>

            <div class="info">
              <span v-text="vehicle.color"></span>
              <div>Color</div>
            </div>

            <div class="info">
              <span v-text="vehicle.year"></span>
              <div>Year</div>
            </div>

            <div class="info">
              <span v-text="vehicle.inspect"></span>
              <div>Inspect time</div>
            </div>

            <div class="info">
              <span v-text="vehicle.cc"></span>
              <div>CC</div>
            </div>

            <div class="info">
              <span v-text="vehicle.location"></span>
              <div>Location</div>
            </div>

            <div class="info">
              <span v-text="vehicle.tm"></span>
              <div>T/M</div>
            </div>
          </div>
        </div>

      </el-col>
    </el-row>

    <el-row>
      <el-col  :offset="1" :span="10">
        <el-button style="width: 100%; margin: 0 auto; height: 250px; border-radius: 30px; font-size: 30px; background-color: #f3a45d">
          request an inspection
          <img src="/views/homePage/car.png" alt="car icon">
        </el-button>
      </el-col>
      <el-col :span="10" :offset="2">
        <el-button @click="$router.push('/pay/check-order')" style="width: 100%; margin: 0 auto; height: 250px; border-radius: 30px; font-size: 30px; background-color: #ee733b">
          place an order
          <img src="/views/homePage/shop.png" alt="shop icon">
        </el-button>
      </el-col>
    </el-row>






  </div>

</template>

<style scoped>
  .carousel {
    margin-top: 35px;
  }

  .carousels-pic {
    width: 100%;
  }

  .fundamental-detail {
    margin-top: 35px;
  }

  .price {
    margin-top: 20px;
    background: #dfdfe0;
  }

  .other-info {
    display: flex;
    flex-direction: row;
    margin-top: 20px;
    flex-wrap: wrap;
  }

  .other-info .info {
    margin-top: 10px;
    text-align: center;
    width: 120px;
    display: flex;
    flex-direction: column;
    font-size: 20px;
  }

  .other-info .info div{
    color: #888888;
  }
</style>