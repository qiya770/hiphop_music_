<!--
 * @Author: your name
 * @Date: 2021-03-24 14:19:12
 * @LastEditTime: 2021-04-08 16:11:03
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \VS coded:\music\code\music\music-client\src\components\search\SearchSongLists.vue
-->
<template>
    <div class="search-song-Lists">
       <content-list :contentList="albumDatas"></content-list>
    </div>
</template>
<script>
import ContentList from '../ContentList';
import {getSongListOfLikeTitle} from '../../api/index';
import {mixin} from "../../mixins";

export default {
    name: 'search-song-lists',
    components:{
        ContentList
    },
    data(){
        return{
            albumDatas: []
        }
    },
    mounted(){
        this.getSearchList();
    },
    methods:{
        getSearchList(){
            if(!this.$route.query.keywords){
                this.notify('您输入的内容为空','warning')
            }else{
                getSongListOfLikeTitle(this.$route.query.keywords)
                    .then(res =>{
                        if(res){
                            this.albumDatas = res
                        }else{
                            this.notify('暂无该歌曲内容','warning')
                        }
                    })
            }
        }
    }
}
</script>

<style lang="scss" scoped>
@import '../../assets/css/search-song-lists.scss';
</style>