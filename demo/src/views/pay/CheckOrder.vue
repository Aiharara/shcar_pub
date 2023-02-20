<script>
export default {
  name: "check-order",
  data() {
    return {
      data : {
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
      },
      centerDialogVisible : false,
    }
  }
}
</script>

<template>
  <div class="main">
    <span style="font-size: 25px" >
      Secure Online Payment
  </span>
    <div style="display: flex; height: 110px; margin-top: 35px" @click="$router.push('/mall/details')">
      <div
          style="
        width: 145px;
        display: flex;
        justify-content: center;
        align-items: center;
        border: 1px solid #ebeef5;
      "
      >
        <img style="width: 100px; height: 75px" :src="data?.image" />
      </div>
      <div>
        <div
            style="
          height: 40px;
          border: 1px solid #ebeef5;
          display: flex;
          align-items: center;
          justify-content: space-between;
          padding: 0 5px;
          box-sizing: border-box;
        "
        >
          <div>{{ data?.model }} / {{ data?.grade }}</div>
          <div style="background-color: #882bc4; padding: 3px; color: #ffffff">
            Bid Free
          </div>
        </div>
        <div style="display: flex" class="row-item-bottom">
          <div style="width: 220px">
            <div>{{ data?.auctionSite }}</div>
            <div style="display: flex">
              <div style="width: 150px">{{ data?.location }}</div>
              <div>{{ data?.lotNo }}</div>
            </div>
          </div>
          <div style="width: 70px; align-items: center">{{ data?.year }}</div>
          <div style="width: 120px">
            <div>{{ data?.type }}</div>
            <div>{{ data?.cc }}</div>
          </div>
          <div style="width: 120px">
            <div>{{ data?.inspect }}</div>
            <div>{{ data?.odo }}</div>
          </div>
          <div style="width: 100px">
            <div>{{ data?.color }}</div>
            <div>{{ data?.colorNo }}</div>
          </div>
          <div style="width: 100px">
            <div>{{ data?.tm }}</div>
            <div>{{ data?.ac }}</div>
          </div>
          <div style="width: 100px; align-items: center">
            <div>{{ data?.score }}</div>
            <div>{{ data?.extInt }}</div>
          </div>
          <div style="width: 120px; align-items: center">
            {{ data?.startPrice }}
          </div>
          <div style="width: 100px; align-items: center">
            <div>{{ data?.startDate }}</div>
            <div>{{ data?.startTime }}</div>
          </div>
        </div>
      </div>
    </div>

    <hr style="width: 93%; margin: 35px auto 0 0">
    <br><br>
    <div style="display: flex; flex-direction: row; margin-right: 100px">
      <span style="flex-grow: 1"></span>
      <span style="color: #888888">
        Grand total:
      </span>
      <span style="width: 70px;"></span>
      <div class="price">
        ${{data?.startPrice}}.00
      </div>

    </div>
    <hr style="width: 93%; margin: 35px auto 0 0">

    <el-row style="margin-top: 100px">
      <el-col :offset="17" :span="6" >
        <el-button @click="centerDialogVisible = true" style="width: 100%; margin: 0 auto; height: 100px; border-radius: 30px; font-size: 30px; background-color: lightblue">
          Process Payment
        </el-button>
      </el-col>
    </el-row>
  </div>

<!--  dialog  -->
  <div>
    <el-dialog
        v-model="centerDialogVisible"
        title="Payment Card Details"
        width="70%"
        align-center
    >
      <div class="pay-dialog" style="width: 70%; margin: 5px auto">
        <div class="pay-dialog-row">
          <span>Number</span>
          <span class="flex-grow"></span>
          <span>3005179</span>
        </div>

        <div class="pay-dialog-row">
          <span>Amount</span>
          <span class="flex-grow"></span>
          <span style="color: #000000">$25,413.00</span>
        </div>

        <div class="pay-dialog-row">
          <span>Email</span>
          <span class="flex-grow"></span>
          <span>buyer001@gmail.com</span>
        </div>



        <div class="pay-dialog-row" style="margin-top: 30px">
          <span>Card Number</span>
          <span class="flex-grow"></span>
          <el-input style="width: 40%" placeholder="Card Number"></el-input>
        </div>

        <div class="pay-dialog-row">
          <span>Expiry Date</span>
          <span class="flex-grow"></span>
          <span>Month</span>
          <el-input style="width: 20%;" placeholder="MM"></el-input>
          <span>Year</span>
          <el-input style="width: 20%;" placeholder="YY"></el-input>
        </div>

        <div class="pay-dialog-row" style="margin-top: 50px">
          <span class="flex-grow"/>

          <el-button type="primary">
            Verify and Continue
          </el-button>

          <el-button type="danger" @click="centerDialogVisible = false">
            Cancel and back
          </el-button>
        </div>
      </div>
    </el-dialog>
  </div>

</template>



<style scoped>
.row-item-bottom > div {
  box-sizing: border-box;
  height: 70px;
  border: 1px solid #ebeef5;
  display: flex;
  flex-direction: column;
  justify-content: center;
  gap: 8px;
  padding: 0 5px;
}
.main {
  margin: 35px;
}

.pay-dialog {
  display: flex;
  flex-direction: column;
}

.pay-dialog-row {
  display: flex;
  flex-direction: row;
  margin-top: 5px;
  font-size: 18px;
  color: #888888;
}

.flex-grow {
  flex-grow: 1;
}

</style>