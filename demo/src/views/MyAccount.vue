<template>
  <div style="margin-top: 50px">
    <el-form
      :model="form"
      label-width="150px"
      style="width: 400px; margin: 0 auto 0 auto"
    >
      <el-form-item label="Username">
        <el-input v-model="$store.state.userInfo.username" style="width: 250px" />
      </el-form-item>
      <el-form-item label="Level"> platinum member </el-form-item>
      <el-form-item label="Current Point Balance"> 7746 P </el-form-item>
      <el-form-item label="Password">
        <el-button>Change</el-button>
      </el-form-item>
      <el-form-item label="Email">
        <el-input v-model="$store.state.userInfo.email" style="width: 250px" />
      </el-form-item>
      <el-form-item label="Account Type">
        <el-select v-model="$store.state.userInfo.userType" style="width: 250px" disabled>
          <el-option :value="0" label="Administrator" />
          <el-option :value="1" label="Seller" />
          <el-option :value="2" label="Buyer" />
          <el-option :value="3" label="Visitor" />
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-button type="primary">Save</el-button>
      </el-form-item>
    </el-form>

    <div style="width: 600px; margin: 50px auto 0 auto">
      <div style="margin-bottom: 10px">Recent order information</div>
      <el-table :data="tableData" style="width: 100%">
        <el-table-column prop="date" label="Date" width="150" />
        <el-table-column prop="seller" label="Seller" width="150" />
        <el-table-column prop="address" label="Address" />
        <el-table-column fixed="right" label="" width="50">
          <template #default>
            <el-button
              link
              type="primary"
              size="small"
              @click="dialogVisible = true"
            >
              Detail
            </el-button>
          </template>
        </el-table-column>
      </el-table>
    </div>
  </div>

  <el-dialog v-model="dialogVisible" title="Detail" width="1320">
    <SearchResultRow :data="detailItem" />
  </el-dialog>
</template>

<script>
import SearchResultRow from "./searchResult/components/SearchResultRow.vue";
export default {
  name: "MyAccount",
  components: { SearchResultRow },
  data() {
    return {
      form: {
        username: "Myron",
        email: "xxx@xxx.xxx",
        phone: "123456",
        accountType: 1,
      },
      tableData: [
        {
          date: "2016-05-03",
          seller: "Tom",
          address: "No. 189, Grove St, Los Angeles",
        },
        {
          date: "2016-05-02",
          seller: "Tom",
          address: "No. 189, Grove St, Los Angeles",
        },
        {
          date: "2016-05-04",
          seller: "Tom",
          address: "No. 189, Grove St, Los Angeles",
        },
      ],
      dialogVisible: false,
      detailItem: {
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
      },
    };
  },
};
</script>

<style scoped></style>
