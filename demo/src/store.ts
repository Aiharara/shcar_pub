import { createStore } from "vuex";

export default createStore({
  state: {
    loginDialogVisible: false,
    isVisitor: true,
    // 0-admin, 1-seller, 2-buyer, 3-visitor
    userTypes: ["admin","seller","buyer","visitor"],
    userType: 3,
    userInfo: {
      username: 'Myron',
      userType: 3,
      email: 'myron2231@gmail.com',
    },
    targetUserInfo: {
      username: 'Myron',
      userType: 3,
      email: 'myron2231@gmail.com',
    }
  },
  mutations: {
    setLoginDialogVisible(state, payload) {
      state.loginDialogVisible = payload.visible;
    },
    setUserInfo(state, payload) {
      state.userInfo.userType = payload.type;
      state.userInfo.username = payload.username;
      state.userInfo.email = payload.email;
      state.isVisitor = false;
    },
    setTargetUserInfo(state, payload) {
      state.targetUserInfo.userType = payload.type;
      state.targetUserInfo.username = payload.username;
      state.targetUserInfo.email = payload.email;
    }
  },
  actions: {},
  modules: {},
});
