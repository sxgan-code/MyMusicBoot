<template>
  <div id="app" style="height: 100%;">
    <Header></Header>
    <div style="height: 100%;">
      <Aside></Aside>
      <Main></Main>
    </div>

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
