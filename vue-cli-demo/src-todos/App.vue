<template>
  <div class="todo-container">
    <div class="todo-wrap">
      <todo-header :addTodo="addTodo" />
      <todo-list :todos="todos" :deleteTodos="deleteTodos"/>
      <todo-footer :todos="todos"  :selectAllTodos="selectAllTodos" :deleteCompleteTodos="deleteCompleteTodos" />
    </div>
  </div>
</template>

<script>
  import TodoHeader from './components/TodoHeader.vue'
  import TodoList from './components/TodoList.vue'
  import TodoFooter from './components/TodoFooter.vue'

  export default {
    name: 'App',
    data(){
      return{
        //todos:[
          // {title: "吃饭",complete:false},
          // {title: "睡觉",complete:true},
          // {title: "写程序",complete:false},
          // {title: "打游戏",complete:false},
          //从localStorage读取数据
        //]
        todos: JSON.parse(window.localStorage.getItem("todos_key") || "[]")

      }
    },
    watch:{ //监视
      todos:{
        deep:true,
        handler:function (newValue) {
          //将todos最新的值json数据，保存到localStorage
          window.localStorage.setItem("todos_key",JSON.stringify(newValue));

        }
      }


    },
    methods:{
      addTodo(todo){
        this.todos.unshift(todo);
      },
      deleteTodos(index){
        this.todos.splice(index,1)
      },
      //删除所有选中的todo
      deleteCompleteTodos(){
        this.todos = this.todos.filter(todo => !todo.complete);
      },
      //全选或全不选
      selectAllTodos(isCheck){
        this.todos.forEach(todo=>todo.complete=isCheck);

      }
    },
    components:{
      TodoHeader,
      TodoList,
      TodoFooter
    }
  }
</script>

<style scoped>
   .todo-container {
    width: 600px;
    margin: 0 auto;
  }
  .todo-container .todo-wrap {
    padding: 10px;
    border: 1px solid #ddd;
    border-radius: 5px;
  }
</style>
