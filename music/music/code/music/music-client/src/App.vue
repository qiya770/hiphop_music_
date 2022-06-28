<!--
 * @Author: your name
 * @Date: 2020-08-14 21:07:46
 * @LastEditTime: 2021-04-06 12:32:36
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \VS coded:\music\code\music\music-client\src\App.vue
-->
<template>
  <div id="app">
    <the-header />
    <router-view class="music-content"/>
    <song-audio/>
    <the-aside/>
    <play-bar/>
    <scroll-top/> 
    <the-footer/>  
  </div>
</template>

<script>
import TheHeader from './components/TheHeader';
import ScrollTop from './components/ScrollTop';
import TheFooter from './components/TheFooter';
import SongAudio from './components/SongAudio';
import TheAside from './components/TheAside';
import PlayBar from './components/PlayBar';

export default {
  name: 'App',
  components: {
    TheHeader,
    ScrollTop,
    TheFooter,
    SongAudio,
    TheAside,
    PlayBar
  }
}
</script>

<style  lang="scss" scoped>
@import './assets/css/app.scss';
</style>
