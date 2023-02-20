<script setup lang="ts">
import HelloWorld from './components/HelloWorld.vue'
import NavBar from './components/NavBar.vue'
import Footer from './components/Footer.vue'

</script>

<template>
<!--  <div>-->
<!--    <a href="https://vitejs.dev" target="_blank">-->
<!--      <img src="/vite.svg" class="logo" alt="Vite logo" />-->
<!--    </a>-->
<!--    <a href="https://vuejs.org/" target="_blank">-->
<!--      <img src="./assets/vue.svg" class="logo vue" alt="Vue logo" />-->
<!--    </a>-->
<!--  </div>-->
  <div class="main">
    <NavBar language="CN"/>
    <div style="width: 100%">
      <router-view :keep-alive="false"/>
    </div>
    <Footer/>
  </div>
</template>

<style scoped>
.main {
  width: 100%;

}

.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
}
.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}
.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
router-view {
  width: 100%;
}
</style>
