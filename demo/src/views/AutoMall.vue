<template>
  <div class="main">

    <!--  wholesale  -->
    <div>
      <div style="background-color: #565760; padding: 5px; margin: 0.7% 0">
        <span style="margin: 0 5% 0 0.5%; font-size: 18px; color: #FFF;">{{ $t('auto-mall.wholesale') }}</span>

        <el-button class="select-button">
          {{ $t('auto-mall.selectors.select-all') }}
        </el-button>
        <el-button class="select-button">
          {{ $t('auto-mall.selectors.allowed-select') }}
        </el-button>
        <el-button class="select-button">
          {{ $t('auto-mall.selectors.clear-all') }}
        </el-button>
      </div>
      <!--   merchant list   -->
      <div style="display: flex;flex-wrap: wrap;flex-direction: row; margin: 1% 1%">
        <span style="background-color: #475669; display: flex;flex-wrap: wrap;flex-direction: column; margin: 20px" v-for="i in 5">
          <el-checkbox style="padding: 2px 7px">
            <p style="color: white">name</p>
          </el-checkbox>
          <img class="carousels-pic" src="/views/homePage/aston-martin-g0983ba8cb_1920.jpg" alt="logo" style="height: 45px; display: flex;">
          <span style="color: #FFF; padding: 2px 7px">11234 Listed</span>
        </span>
      </div>
    </div>

    <!--  auction  -->
    <div>
      <div style="background-color: #565760; padding: 5px; margin: 0.7% 0">
        <span style="margin: 0 5% 0 0.5%; font-size: 18px; color: #FFF;">
          {{ $t('auto-mall.auction') }}
        </span>

        <el-button class="select-button">
          {{ $t('auto-mall.selectors.select-all') }}
        </el-button>
        <el-button class="select-button">
          {{ $t('auto-mall.selectors.allowed-select') }}
        </el-button>
        <el-button class="select-button">
          {{ $t('auto-mall.selectors.clear-all') }}
        </el-button>
      </div>
      <!--   merchant list   -->
      <div style="display: flex;flex-wrap: wrap;flex-direction: row; margin: 1% 1%">
        <el-row style="width: 100%">
          <el-col :span="4" v-for="day in 6" :key="day">

            <div style="display: flex;flex-direction: column">
              <div style="text-align: center; background-color: #999999;">{{ $t('public.weekdays.'+(day-1)) }}</div>
              <div class="merchant-auction-list" style="display: flex;flex-direction: column; flex-wrap: wrap; height: 500px; width: 40%; margin-left: 20px">
                <span style="background-color: #475669; display: flex;flex-wrap: wrap;flex-direction: column; margin: 3px" v-for="i in numberOfAuction[day-1]">
                  <el-checkbox style="padding: 2px 7px">
                    <p style="color: white">name</p>
                  </el-checkbox>
                  <img class="carousels-pic" src="/views/homePage/aston-martin-g0983ba8cb_1920.jpg" alt="logo" style="height: 45px; display: flex;">
                  <span style="color: #FFF; padding: 2px 7px">11231 Listed</span>
                </span>
              </div>
            </div>
          </el-col>
        </el-row>
      </div>


    </div>

    <!--  Next Step  -->
    <div>
      <el-button type="primary" round style="float: right; margin-right: 5%; font-size: 35px; height: 10%; position: relative; top: -45px; left: 55px" @click="$router.push('/mall/select-model')">
        <span style="padding: 5px 5px">
          {{ $t('public.frequently-phrase.next') }}
        </span>
      </el-button>
    </div>

  </div>
</template>

<script>
export default {
  data() {
    return{
      numberOfAuction: [
          3,5,4,3,6,2
      ]
    }
  }
}
</script>