<template>
  <div id="app">
    <el-row>
      <el-col :span="24">
        <div class="grid-content bg-purple-dark">
          <Header></Header>
        </div>
      </el-col>
    </el-row>
    <el-row>
      <el-col :span="4">
        <div class="grid-content bg-purple">
          <Aside></Aside>
        </div>
      </el-col>
      <el-col :span="20">
        <div class="grid-content bg-purple-light">
          <Main></Main>
        </div>
      </el-col>
    </el-row>
    <el-row>
      <el-col :span="24">
        <div class="grid-content bg-purple-dark">
          <Footer></Footer>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import Header from "@/components/Header/Header";
import Aside from "@/components/Aside/Aside";
import Main from "@/components/Main/Main";
import Footer from "@/components/Footer/Footer";

export default {
  name: 'App',
  components: {Header,Aside,Main,Footer}
}
</script>

<style lang="less">
* {
  margin: 0;
  padding: 0;
}

ul, li {
  list-style: none;
}

a {
  text-decoration: none;
}


</style>
