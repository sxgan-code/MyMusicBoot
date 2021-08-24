<template>
  <div id="app" >
<!--    <Header></Header>-->
<!--    <div style="height: 100%;">-->
<!--      <Aside></Aside>-->
<!--      <Main></Main>-->
<!--    </div>-->
    <div id="my-header"><MyHeader></MyHeader></div>
    <div id="my-aside"></div>
    <div id="my-main">
      <div id="my-top"></div>
      <div id="my-footer"></div>
    </div>

  </div>
</template>

<script>
import MyHeader from "@/components/Header/MyHeader";
import MyAside from "@/components/Aside/MyAside";
import MyMain from "@/components/Main/MyMain";
import MyFooter from "@/components/Footer/MyFooter";

export default {
  name: 'App',
  components: {MyHeader,MyAside,MyMain,MyFooter}
}
</script>

<style lang="less" scoped>
#app{
  height: 100%;
  width: 100%;
}
#my-header{
  height: 8%;
  width: 100%;
}
#my-aside{
  height: 92%;
  width: 12%;
  background: seagreen;
  float: left;
}
#my-main{
  height: 92%;
  width: 88%;
  background: seashell;
  float: right;
}
#my-top{
  height: 93%;
  width: 100%;
  background: yellow;
}
#my-footer{
  height: 7%;
  width: 100%;
  background: deeppink;
}
</style>
