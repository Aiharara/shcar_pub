<script>
export default {


  data() {
    return {
      carList: [
        { brand: "TOYOTA", checked: true },
        { brand: "LEXUS", checked: false },
        { brand: "NISSAN", checked: false },
        { brand: "HONDA", checked: false },
        { brand: "MITSUBISHI", checked: false },
      ],
    };
  },
  methods: {
    selectAll() {
      this.carList.forEach((item) => (item.checked = true));
    },
    clearAll() {
      this.carList.forEach((item) => (item.checked = false));
    },
  },
};
</script>

<template>
  <div class="car-list-page">
    <div class="car-list-head">
      <div>Japanese</div>
      <div>
        <el-button type="primary" size="small" @click="selectAll">
          All
        </el-button>
        <el-button type="primary" size="small" @click="clearAll">
          Clear All
        </el-button>
      </div>
    </div>
    <div class="car-list">
      <div
        class="car-list-item"
        :style="{ backgroundColor: item.checked ? 'pink' : '#ccc' }"
        v-for="(item, index) in carList"
        :key="index"
      >
        <el-checkbox v-model="item.checked" />
        <div class="logo"><img src="/vite.svg" /></div>
        <div
          class="brand"
          :style="{ backgroundColor: item.checked ? '#111' : '#444' }"
        >
          {{ item.brand }}
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
.car-list-head {
  display: flex;
  justify-content: space-between;
  width: 300px;
  margin-bottom: 5px;
}

.car-list-page {
  background-color: #eee;
  padding: 20px;
}

.car-list {
  display: flex;
  flex-direction: column;
  gap: 2px;
}

.car-list-item {
  display: flex;
  align-items: center;
  background-color: #ccc;
  padding-left: 5px;
  width: 300px;
  border-radius: 5px;
}

.car-list-item .logo {
  background-color: #fff;
  height: 40px;
  width: 40px;
  margin-left: 25px;
  display: flex;
  justify-content: center;
  align-items: center;
}

.car-list-item .brand {
  color: #fff;
  background-color: #444;
  width: 220px;
  text-align: center;
  height: 40px;
  line-height: 40px;
  border-top-right-radius: 5px;
  border-bottom-right-radius: 5px;
}
</style>