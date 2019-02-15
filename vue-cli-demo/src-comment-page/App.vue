<template>
  <div>
    <header class="site-header jumbotron">
      <div class="container">
        <div class="row">
          <div class="col-xs-12">
            <h1>请发表对Vue的评论</h1>
          </div>
        </div>
      </div>
    </header>
    <div class="container">
      <!--使用组件标签-->
      <add :addComment="addComment"/>
      <List :comments="comments" :deleteComment="deleteComment"/>
    </div>
  </div>
</template>

<script>
  //1.引入组件
  import Add from './components/Add.vue'
  import List from './components/List.vue'

  export default {
    name: 'App',
    data(){
      return{
        comments:[ //注: 数据在那个组件，操作数据的行为（函数或方法）就在那个组件。
          {name: "Bob",content: "vue 还不错"},
          {name: "Jack",content: "vue so easy"},
          {name: "Kaka",content: "vue so so"}
        ]
      }
    },
    methods:{
      //添加评论
      addComment(comment){
        this.comments.unshift(comment);
      },
      //删除评论
      deleteComment(index){
        this.comments.splice(index,1);
      }

    },
    //2.映射组件标签
    components:{
      Add,
      List
    }
  }
</script>

<style scoped>

</style>
