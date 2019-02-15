<template>
  <li @mouseenter="handleEnter(true)" @mouseleave="handleEnter(false)" :style="{background: bgColor}">
    <label>
      <input type="checkbox" v-model="todo.complete"/>
      <span>{{todo.title}}</span>
    </label>
    <button class="btn btn-danger" v-show="isShow" @click="deleteItem">删除</button>
  </li>
</template>

<script>
  export default {
    name: 'TodoItem',
    props:{
      todo:Object,
      index:Number,
      deleteTodos:Function
    },
    data(){
      return{
        bgColor:'white',
        isShow:false
      }
    },
    methods:{
      handleEnter(isEnter){
        //console.log(this.index+'事件有没有触发?'+isEnter)
        if(isEnter){
          this.bgColor = "#aaaaaa";
          this.isShow = true;
        }else{
          this.bgColor = 'white';
          this.isShow = false;
        }
      },
      deleteItem(){
        const {todo,index,deleteTodos} = this;
        //0.勾选的才能删
        if(!todo.complete){
          alert("请勾选要删除的项！");
          return;
        }
        //1.删除确认
        if(window.confirm(`确定要删 ${todo.title} 吗？`)){
          //2.执行删除
          deleteTodos(index);
        }
      }
    }

  }
</script>

<style scoped>
  /*item*/
  li {
    list-style: none;
    height: 36px;
    line-height: 36px;
    padding: 0 5px;
    border-bottom: 1px solid #ddd;
  }

  li label {
    float: left;
    cursor: pointer;
  }

  li label li input {
    vertical-align: middle;
    margin-right: 6px;
    position: relative;
    top: -1px;
  }

  li button {
    float: right;
    /*display: none;*/
    margin-top: 3px;
  }

  li:before {
    content: initial;
  }

  li:last-child {
    border-bottom: none;
  }
</style>
