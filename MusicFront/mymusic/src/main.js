import Vue from 'vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import axios from "axios";
import App from './App.vue'


Vue.use(ElementUI)
Vue.config.productionTip = false
axios.defaults.baseURL='http://127.0.0.1:9090/music/'
Vue.prototype.$http = axios
new Vue({
  render: h => h(App),
}).$mount('#app')
