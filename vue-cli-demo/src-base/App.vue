<template>
    <div>
        <img src="./assets/logo.png" alt="log" class="logo">
        <!-- 3.第三步：使用组件标签 -->
        <HelloWorld />
    </div>
</template>

<script>
//1.第一步：引入组件
import HelloWorld from './components/HelloWorld.vue'

export default {
    //2.第二步：映射组件标签
    components:{
        HelloWorld
    }
}
</script>

<style>
.logo {
    width: 50px;
    height: 50px;
}
</style>

