<script>
export default {
  data() {
    return {
      modelList: [
        { model: "86", count: 549, checked: true },
        { model: "AQUA", count: 2748, checked: false },
        { model: "Allex", count: 7, checked: false },
        { model: "Allex", count: 7, checked: false },
        { model: "Allex", count: 7, checked: false },
        { model: "Allex", count: 7, checked: false },
        { model: "Allex", count: 7, checked: false },
        { model: "Allex", count: 7, checked: false },
        { model: "Allex", count: 7, checked: false },
        { model: "Allex", count: 7, checked: false },
        { model: "Allex", count: 7, checked: false },
      ],
    };
  },
  methods: {
    selectAll() {
      this.modelList.forEach((item) => (item.checked = true));
    },
    clearAll() {
      this.modelList.forEach((item) => (item.checked = false));
    },
  },
};
</script>

<template>
  <div class="model-list-page">
    <div class="model-list-head">
      <div></div>
      <div>
        <el-button type="primary" size="small" @click="selectAll">
          All
        </el-button>
        <el-button type="primary" size="small" @click="clearAll">
          Clear All
        </el-button>
      </div>
    </div>
    <div class="model-list">
      <div
        class="model-list-item"
        :style="{ backgroundColor: item.checked ? 'pink' : '#ccc' }"
        v-for="(item, index) in modelList"
        :key="index"
      >
        <el-checkbox v-model="item.checked" />
        <div class="model-detail">
          <div>{{ item.model }}</div>
          <div>{{ item.count }}</div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
.model-list-head {
  display: flex;
  justify-content: space-between;
  width: 300px;
  margin-bottom: 5px;
}

.model-list-page {
  background-color: #eee;
  padding: 20px;
}

.model-list {
  display: flex;
  flex-direction: column;
  gap: 2px;
}

.model-list-item {
  display: flex;
  align-items: center;
  background-color: #ccc;
  padding-left: 5px;
  width: 300px;
  border-radius: 5px;
}

.model-list-item .model-detail {
  display: flex;
  justify-content: space-between;
  width: 260px;
  margin-left: 15px;
}
</style>