
<script src="vue.js"></script>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<script src="https://unpkg.com/vue@next"></script>
<!-- import CSS -->
<link rel="stylesheet" href="https://unpkg.com/element-plus/dist/index.css"></link>
<link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css"></link>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-plus"></script>
<script src="https://cdn.jsdelivr.net/npm/vue@2.5.17/dist/vue.js"></script>
<!-- 引入element 的组件库-->
<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script src="js/vue.js" type="text/javascript" charset="utf-8"></script>
<link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css"></link>
<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<template>
    <div>{{msg}}</div>
    <div id="app">
        <el-row>
            <el-button type="primary">按钮1</el-button>
            <el-button type="danger">按钮2</el-button>
            <el-button type="primary">primary</el-button>
            <el-button type="success">success</el-button>
            <el-button type="info">info</el-button>
            <el-button type="warning">warning</el-button>
            <el-button type="danger">danger</el-button>
            <el-button type="text">text</el-button>
        </el-row>

</template>
<style></style>
<script>
    export default {
        data() {
            return {msg: 'vue模板页'}
        }
    }
</script>
转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/A10714075/article/details/121191546