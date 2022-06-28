<!--
 * @Author: your name
 * @Date: 2021-03-08 15:28:47
 * @LastEditTime: 2021-03-23 14:35:23
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \VS coded:\music\code\music\music-client\src\components\Swiper.vue
-->
<template>
    <div class="swiper">
        <el-carousel :interval="4000" type="card" height="280px">
            <el-carousel-item v-for="(item,index) in swiperList" :key="index">
                <img :src="item.picImg"/>
            </el-carousel-item>
        </el-carousel>
    </div>
</template>

<script>
import {swiperList} from "../assets/data/swiper";
export default {
    name: "swiper",
    data() {
        return{
            swiperList: []
        }
    },
    created () {
        this.swiperList=swiperList;
    }
}
</script>

<style lang="scss" scoped>
@import '../assets/css/swiper.scss';
</style>