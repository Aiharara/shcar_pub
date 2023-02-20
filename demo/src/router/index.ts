import { createRouter, createWebHistory } from "vue-router";
const router = createRouter({
    history: createWebHistory(),
    routes: [
        { name: "home", path:"/", component: () => import("../views/HomePage.vue") },
        { name: "home1", path:"/home", component: () => import("../views/HomePage.vue") },
        { name: "mall", path:"/mall", component: () => import("../views/AutoMall.vue") },
        { name: "select model", path:"/mall/select-model", component: () => import("../views/car/IndexPage.vue") },
        { name: "sell car", path:"/sell-car", component: () => import("../views/car/SellCar.vue") },
        { name: "search-result", path:"/mall/search-result", component: () => import("../views/searchResult/index.vue") },
        { name: "market price", path:"/market-price", component: () => import("../views/MarketPrice.vue") },
        { name: "my account", path:"/my-account", component: () => import("../views/MyAccount.vue") },
        { name: "user management", path:"/users/all", component: () => import("../views/management/UserManagement.vue") },
        { name: "edit user", path:"/users/edit", component: () => import("../views/management/EditUser.vue") },
        { name: "vehicle detail", path:"/mall/details", component: () => import("../views/car/VehicleDetails.vue") },
        { name: "check order", path:"/pay/check-order", component: () => import("../views/pay/CheckOrder.vue") },
        { name: "payment", path:"/pay/payment", component: () => import("../views/pay/Payment.vue") },
        { name: "membership", path:"/membership", component: () => import("../views/Membership.vue") },
    ]
})

// router.beforeEach(async (to, from, next) => {
//     if ( to.name == 'search result' ) {
//         // 将用户重定向到登录页面
//         const date = new Date().toJSON();
//         next({name:'search result', params:{aac: date}})
//     } else {
//         next()
//     }
//
//     // if ( to.name == 'home' ) {
//     //     // 将用户重定向到登录页面
//     //     const date = new Date().toJSON();
//     //     return { name: 'home', params:{data: date}}
//     // }
//     return true;
// })
export default router