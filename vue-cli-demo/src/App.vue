<template>
  <div>
    <Search />
    <users-main />
  </div>
</template>

<script>
  import Search from './components/Search.vue'
  import Main from './components/Main.vue'

  export default {
    name: 'App',
    components: {
      Search,
      UsersMain: Main
    }
  }
</script>

<style scoped>

</style>
