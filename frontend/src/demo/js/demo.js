// 그냥 vue 객체에서 createApp 함수 사용
import { createApp } from 'vue';

// 내가 만든 화면단 객체
import App from '../views/demo.vue';


// import './assets/main.css'

// id = 'app' 속성에 해당 객체르 mount한다.
const app = createApp(App).mount('#app')
