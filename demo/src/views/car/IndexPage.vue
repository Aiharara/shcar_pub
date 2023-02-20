<script>
import CarList from "./CarList.vue";
import ModelList from "./ModelList.vue";

export default {
  components: { CarList, ModelList },
  data() {
    return {
      year: ["2022 (R04)", "2019 (R01)"],
      odo: ["30000km", "40000km"],
      score: ["S", "any"],
    };
  },
};
</script>

<template>
  <div style="margin: 5% 0 0 1%">
    <div style="display: flex; gap: 10px; margin-bottom: 10px">
      <CarList />
      <CarList />
      <ModelList />
    </div>

    <div
      style="display: flex; gap: 10px; padding: 10px; background-color: #eee"
    >
      <div>
        <div style="margin-bottom: 5px">Type</div>
        <div class="checkboxList">
          <el-checkbox label="MXPK11" />
          <el-checkbox label="NHP10" />
          <el-checkbox label="NHP10" />
          <el-checkbox label="NHP10" />
          <el-checkbox label="NHP10" />
        </div>
      </div>

      <div>
        <div style="margin-bottom: 5px">Grade</div>
        <div class="checkboxList">
          <el-checkbox label="G" />
          <el-checkbox label="G 4WD" />
          <el-checkbox label="G 4WD" />
          <el-checkbox label="G 4WD" />
          <el-checkbox label="G 4WD" />
        </div>
      </div>

      <div>
        <div style="margin-bottom: 5px">Color</div>
        <div class="checkboxList">
          <el-checkbox>
            <div style="display: flex; align-items: center; gap: 10px">
              <div
                style="width: 32px; height: 18px; border: 1px solid #000"
              ></div>
              <div>White</div>
            </div>
          </el-checkbox>
          <el-checkbox>
            <div style="display: flex; align-items: center; gap: 10px">
              <div
                style="
                  width: 32px;
                  height: 18px;
                  border: 1px solid #000;
                  background-color: red;
                "
              ></div>
              <div>Red</div>
            </div>
          </el-checkbox>
          <el-checkbox>
            <div style="display: flex; align-items: center; gap: 10px">
              <div
                style="
                  width: 32px;
                  height: 18px;
                  border: 1px solid #000;
                  background-color: red;
                "
              ></div>
              <div>Red</div>
            </div>
          </el-checkbox>
          <el-checkbox>
            <div style="display: flex; align-items: center; gap: 10px">
              <div
                style="
                  width: 32px;
                  height: 18px;
                  border: 1px solid #000;
                  background-color: red;
                "
              ></div>
              <div>Red</div>
            </div>
          </el-checkbox>
        </div>
      </div>
    </div>

    <div
      style="display: flex; gap: 10px; padding: 10px; background-color: #eee"
    >
      <div>
        <div style="margin-bottom: 5px">Year</div>
        <div>
          <el-select v-model="year[0]" style="width: 165px">
            <el-option label="2022 (R04)" />
          </el-select>
          <span style="display: inline-block; width: 20px; text-align: center"
            >~</span
          >
          <el-select v-model="year[1]" style="width: 165px">
            <el-option label="2019 (R01)" />
          </el-select>
        </div>
      </div>

      <div>
        <div style="margin-bottom: 5px">Odo</div>
        <div>
          <el-select v-model="odo[0]" style="width: 165px">
            <el-option label="30000km" />
          </el-select>
          <span style="display: inline-block; width: 20px; text-align: center"
            >~</span
          >
          <el-select v-model="odo[1]" style="width: 165px">
            <el-option label="40000km" />
          </el-select>
        </div>
      </div>

      <div>
        <div style="margin-bottom: 5px">Score</div>
        <div>
          <el-select v-model="score[0]" style="width: 165px">
            <el-option label="S" />
          </el-select>
          <span style="display: inline-block; width: 20px; text-align: center"
            >~</span
          >
          <el-select v-model="score[1]" style="width: 165px">
            <el-option label="any" />
          </el-select>
        </div>
      </div>
    </div>

    <div
      style="display: flex; gap: 10px; padding: 10px; background-color: #eee"
    >
      <div>
        <div style="margin-bottom: 5px">Inspection</div>
        <div>
          <el-select v-model="score[1]" style="width: 350px">
            <el-option label="any" />
          </el-select>
        </div>
      </div>

      <div>
        <div style="margin-bottom: 5px">T/M</div>
        <div>
          <el-select v-model="score[1]" style="width: 350px">
            <el-option label="any" />
          </el-select>
        </div>
      </div>

      <div>
        <div style="margin-bottom: 5px">Auction Schedule</div>
        <div>
          <el-select v-model="score[1]" style="width: 350px">
            <el-option label="any" />
          </el-select>
        </div>
      </div>
    </div>

    <!--  Next Step  -->
    <div>
      <el-button
        type="primary"
        round
        style="float: right; margin-right: 5%; font-size: 35px; height: 10%"
        @click="$router.push('/mall/search-result')"
      >
        <span style="padding: 5px 5px">{{ $t('public.frequently-phrase.next') }}</span>
      </el-button>
    </div>
  </div>
</template>

<style scoped>
.checkboxList {
  display: flex;
  flex-direction: column;
  width: 315px;
  height: 160px;
  padding: 0 10px;
  background-color: #ffffff;
}
</style>
