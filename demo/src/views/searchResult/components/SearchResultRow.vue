<template>
  <div :style=" 'display: flex; height: 110px; background-color:' + bgColor[data?.method]"  @click="$router.push('/mall/details')">
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
        <div style="width: 300px">
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
</template>

<script>
export default {
  name: "SearchResultRow",
  props: ["data"],
  data() {
    return {
      bgColor: ["white", "lightgreen", "lightpink"]
    }
  },
  mounted() {

  }
};
</script>

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
</style>
