<template>
  <div class="container">
    <h1>Items from backend</h1>
    <div>
      <b-table striped hover :items="items"></b-table>
    </div>
    <form @submit.prevent="submitForm">
      <input type="text" v-model="name" placeholder="name" required />
      <input type="text" v-model="email" placeholder="Email" required />
      <input type="text" v-model="username" placeholder="username" required />
      <button type="submit">Submit</button>
    </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      items: [],
      name: "",
      email: "",
      username: "",
    };
  },

  mounted() {
    axios
      .get("http://localhost:8080/")
      .then((response) => (this.items = response.data));
  },
  methods: {
    submitForm() {
      const item = {
        name: this.name,
        email: this.email,
        username: this.username,
      };
      axios
        .post("http://localhost:8080/", item)
        .then((response) => (this.items = response.data));
    },
  },
};
</script>