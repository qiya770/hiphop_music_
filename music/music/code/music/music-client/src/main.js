/*
 * @Author: your name
 * @Date: 2020-08-14 21:07:46
 * @LastEditTime: 2021-03-09 16:02:32
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \VS coded:\music\code\music\music-client\src\main.js
 */
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store/index'
import './assets/css/index.scss'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import '@/assets/js/iconfont.js'
import '@/assets/js/iconfont1.js'
import '@/assets/js/iconfont2.js'
import '@/assets/js/iconfont3.js'

Vue.use(ElementUI)

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
