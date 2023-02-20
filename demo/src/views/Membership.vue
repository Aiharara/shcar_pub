<template>
  <div class="main">
    <div style="font-size: 30px" class="title">Membership rewards program</div>

    <div class="benefit-detail">
      <el-row>
        <el-col :span="6" :offset="2" class="detail">
          <div class="rank silver">Silver</div>
          <div class="condition">
            <div class="desc" style="flex-direction: column">Accumulated Points <div class="bigger">Over 10,000</div></div>
          </div>
          <div class="desc">
            <hr class="hr-80">
          </div>
          <div class="desc" v-for="item in benefits[0]">
            <el-icon color="#008080" size="20px">
              <Check />
            </el-icon>
            <div>
              <div style="margin-left: 8px; text-align: left;" v-html="item"/>
            </div>
          </div>
        </el-col>
        <el-col :span="6" :offset="1" class="detail">
          <div class="rank gold">Gold</div>
          <div class="condition">
            <div class="desc" style="flex-direction: column">Accumulated Points <div class="bigger">Over 100,000</div></div>
          </div>
          <div class="desc">
            <hr class="hr-80">
          </div>
          <div class="desc" v-for="item in benefits[1]">
            <el-icon color="#008080" size="20px">
              <Check />
            </el-icon>
            <div>
              <div style="margin-left: 8px; text-align: left;" v-html="item"/>
            </div>
          </div>
        </el-col>
        <el-col :span="6" :offset="1" class="detail">
          <div class="rank diamond">Diamond</div>
          <div class="condition">
            <div class="desc" style="flex-direction: column">Accumulated Points <div class="bigger">Over 1000,000</div></div>
          </div>
          <div class="desc">
            <hr class="hr-80">
          </div>
          <div class="desc" v-for="item in benefits[2]">
            <el-icon color="#008080" size="20px">
              <Check />
            </el-icon>
            <div>
              <div style="margin-left: 8px; text-align: left;" v-html="item"/>
            </div>
          </div>
          <br>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
export default {
  name: "Membership",
  data() {
    return {
      benefits: [
        [
          "7*24h <span style='font-size: 20px;color: black;'>Exclusive</span> Customer Service",
          "Video <span style='font-size: 20px;color: black;'>Remote Inspection</span>  Service",
          "<span style='font-size: 20px;color: black;'>20% more</span> integral",
          "<span style='font-size: 20px;color: black;'>1,000 times per month</span> market price inquiries",
          "<span style='font-size: 20px;color: black;'>exquisite gifts</span> points redemption",
        ],
        [
          "7*24h <span style='font-size: 20px;color: black;'>Exclusive</span> Customer Service",
          "Video <span style='font-size: 20px;color: black;'>Remote Inspection</span>  Service",
          "<span style='font-size: 20px;color: black;'>40% more</span> integral",
          "<span style='font-size: 20px;color: black;'>10,000 times per month</span> market price inquiries",
          "<span style='font-size: 20px;color: black;'>exquisite gifts</span> points redemption",
        ],
        [
          "7*24h <span style='font-size: 20px;color: black;'>Exclusive</span> Customer Service",
          "Video <span style='font-size: 20px;color: black;'>Remote Inspection</span>  Service",
          "<span style='font-size: 20px;color: black;'>88% more</span> integral",
          "<span style='font-size: 20px;color: black;'>Unlimited times</span> market price inquiries",
          "<span style='font-size: 20px;color: black;'>exquisite gifts</span> points redemption",
        ]
      ]
    }
  }
}
</script>

<style scoped>
.main {
}

.title {
  margin: 35px;
}

.detail {
  border: 1px solid #000000;
  text-align: center;
  border-radius: 15px;
}

.benefit-detail {
  display: flex;
  flex-direction: column;
  text-align: center;
}

.rank {
  font-size: 25px;
  color: #000000;
  background: #f1f1f1;
  border-radius: 15px 15px 0 0;
  height: 50px;
  margin: 0 auto;
  padding-top: 20px;
}

.desc {
  color: #888888;
  display: flex;
  flex-direction: row;
  padding: 5px;
  margin: 0 5px;
}

.bigger{
  font-size: 30px;
  color: #000000;
}

.condition {
  margin: 20px;
}

.hr-80 {
  width: 80%;
  margin: 20px;
}

.silver {
  background: radial-gradient(ellipse 220px 70px at 50%, #F0F0F0, #8E8E8E, #F0F0F0);
}

.gold {
  background: radial-gradient(ellipse 220px 70px at 50%, #FFF0AC, #FFDC35, #FFF0AC);
}

.diamond {
  background: radial-gradient(ellipse 220px 70px at 50%, #D9FFFF, #4DFFFF, #D9FFFF);
}
</style>