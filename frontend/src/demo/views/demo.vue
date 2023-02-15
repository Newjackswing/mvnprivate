<template>
  <h3>{{ message }}</h3>
  <button @click="messagesReverse(message);">{{ message }}</button>
  <button @click="requestRestController();">{{ restResponse }}</button>
</template>

<script>
import axios from "axios";

export default {
  name: "demo",
  data: () => ({
    message: 'HELLO WORLD!',
    restResponse: 'null'
  }),
  methods: {
    messagesReverse(text) {
      debugger;
      this.message = text.split('').reverse().join('');
    },
    async requestRestController() {
      var apiUrl = "http://localhost:8080/api/main/test.do";

      var config = {
        method: 'post',
        maxBodyLength: Infinity,
        url: 'localhost:8080/api/main/test.do'
      };

      axios(config)
          .then(function (response) {
            console.log(JSON.stringify(response.data));
          })
          .catch(function (error) {
            console.log(error);
          });

    }
  }
}
</script>

<style scoped>

</style>