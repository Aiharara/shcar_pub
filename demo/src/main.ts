import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import router from "./router/index"
import store from './store'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import { createI18n } from 'vue-i18n'



const app = createApp(App)

for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}

import zh_CN from './i18n/zh-CN.json'
import en_US from './i18n/en-US.json'

const messages = {
    'zh-CN': zh_CN,
    'en-US': en_US,
}

const i18n = createI18n({
    locale: 'en-US',
    fallbackLocale: 'en-US',
    messages,
})


app.use(router)
    .use(store)
    .use(ElementPlus)
    .use(i18n)
    .mount('#app')
