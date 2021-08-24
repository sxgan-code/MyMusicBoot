<template>
  <div id="main-root">
      <el-col :span="20">
        <div class="grid-content bg-purple-light">
          <el-table
              :data="tableData.filter(data => !search || data.name.toLowerCase().includes(search.toLowerCase()))"
              style="width: 100%">
            <el-table-column
                label="编号"
                prop="stuId">
            </el-table-column>
            <el-table-column
                label="名称"
                prop="stuName">
            </el-table-column>
            <el-table-column
                label="年龄"
                prop="stuAge">
            </el-table-column>
            <el-table-column
                label="性别"
                prop="stuSex">
            </el-table-column>
            <el-table-column
                align="right">
              <template slot="header" slot-scope="scope">
                <el-input
                    v-model="search"
                    size="mini"
                    placeholder="输入关键字搜索"/>
              </template>
              <template slot-scope="scope">
                <el-button
                    size="mini"
                    @click="handleEdit(scope.$index, scope.row)">Edit</el-button>
                <el-button
                    size="mini"
                    type="danger"
                    @click="handleDelete(scope.$index, scope.row)">Delete</el-button>
              </template>
            </el-table-column>
          </el-table>
        </div>
        <Footer></Footer>
      </el-col>

  </div>
</template>

<script>
import axios from 'axios';
import Footer from "@/components/Footer/Footer";
export default {
  components: {
    Footer
  },
  name: "Main",
  data() {
    return {
      tableData: [],
      search: ''
    }
  },
  methods: {
    handleEdit(index, row) {
      console.log(index, row);
    },
    handleDelete(index, row) {
      console.log(index, row);
    },
    async initTableData(){
      const { data:res } = await this.$http.get("/api/studentData");
      console.log(res)
      this.tableData = res.data
    }
  },
  created() {
    this.initTableData();
  }
}
</script>

<style scoped>
#main-root{
  width: 1281px;
  position: fixed;
  right: 0;
}
</style>