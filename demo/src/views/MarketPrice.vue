<script>
export default {
  name: "MarketPrice.vue",
  data() {
    return{
      tableData :[
        {
          date: '2022-01-13',
          model: 'Tesla Model Y',
          knockDownPrice: 476123,
          mileage: 40000,
          year: 2018,
          priceRating: "Fair Price",
        },
        {
          date: '2022-01-12',
          model: 'Tesla Model Y',
          knockDownPrice: 209123,
          mileage: 20000,
          year: 2020,
          priceRating: "Great Deal",
        },
        {
          date: '2022-01-11',
          model: 'Tesla Model Y',
          knockDownPrice: 110123,
          mileage: 30000,
          year: 2019,
          priceRating: "Good Deal",
        },
        {
          date: '2022-01-10',
          model: 'Tesla Model Y',
          knockDownPrice: 366123,
          mileage: 18888,
          year: 2012,
          priceRating: "Good Price",
        },
      ]
    }
  },
}
</script>

<template>
  <div style="text-align: center;margin-top: 3%">
    <span>
      <input type="text" style="height: 30px; width: 25%; border-radius: 10px 0 0 10px; font-size: 25px "/>
    </span>
    <span style="height: 30px; font-size: 28px; ">
      <el-button type="primary" style="height:36px; font-size: 35px; border-radius: 0 10px 10px 0; position: relative; top:-1px">
        Search
      </el-button>
    </span>
  </div>

  <div style="margin-top: 3%">
    <el-row>
      <el-col :offset="4" :span="16">
        <span>Recent sales of the </span><span style="font-weight: bold;">Tesla Model Y</span>
        <el-table :data="tableData" stripe style="width: 100%; margin-top: 1%">
          <el-table-column prop="date" label="Date" width="180" />
          <el-table-column prop="model" label="Model" width="180" />
          <el-table-column prop="knockDownPrice" label="Knock Down Price" />
          <el-table-column prop="mileage" label="Mileage(miles)" />
          <el-table-column prop="year" label="Year" />
          <el-table-column prop="priceRating" label="Price Rating" />
          <el-table-column>
            <el-button type="primary">view details</el-button>
          </el-table-column>

        </el-table>
      </el-col>
    </el-row>
  </div>
</template>

<style scoped>

</style>