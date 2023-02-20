<template>
  <body>
    <main>
      <footer>
        <div class="container">
          <div class="content-footer">
            <div class="profile">
<!--              <div class="logo-area">-->
<!--                <img :src="logo" alt="logo">-->
<!--              </div>-->
              <div class="staff-area">
                <p>{{ $t("footer.intro") }}</p>
              </div>
              <div class="social-media">
                <a v-for="i in 4" :href="socialMedia.links[i-1]">
                  <img :src="socialMedia.logos[i-1]" :alt="socialMedia.alts[i-1]">
                </a>
              </div>
            </div>
            <div class="service-area">
              <ul v-for="i in serviceNum" class="service-header">
                <li class="service-name">{{ $t('footer.services.'+(i-1)+'.label') }}</li>
                <li v-for="j in serviceItemNum[i-1]"><a :href="services[i-1].links[j-1]">{{ $t('footer.services.'+(i-1)+'.navs.'+(j-1)) }}</a></li>
              </ul>
            </div>
          </div>
          <hr>
          <div class="footer-bottom">
            <div class="copyright">
              <i></i>
              <span>SH Car</span>
            </div>
            <div class="tou">
              <a href="/term_of_use">{{ $t("footer.term-of-use") }}</a>
              <a href="/privacy_policy">{{ $t("footer.privacy-policy") }}</a>
              <a href="#">Cookie</a>
            </div>
          </div>
        </div>
      </footer>
    </main>
  </body>

</template>

<script>
export default {
  name: "Footer",
  data() {
    return{
      // logo: require("~img/logo/logo_200x100.png"),
      socialMedia: {
        logos: [
          "/views/logos/twitter.png",
          "/views/logos/facebook.png",
          "/views/logos/youtube.png",
          "/views/logos/email.png"
        ],
        alts: [
          "twitter logo",
          "facebook logo",
          "youtube logo",
          "email logo",
        ],
        links: [
          "https://twitter.com/GenshinImpact",
          "https://www.facebook.com/",
          "https://www.youtube.com/",
          "https://mail.google.com/mail/u/0/#inbox"
        ]
      },
      services: [
        {
          header: "I'm buyer",
          names: [
            "Auto Mall",
            "Order List",
            "Transaction Progress",
            "After-sales Service"
          ],
          links: [
            "/about",
            "/aboutUs",
            "/contactUs",
            "/joinUs",
          ]
        },
        {
          header: "I'm a seller",
          names: [
            "Vehicle Valuation",
            "Vehicle Appraisal",
            "Sale Process"
          ],
          links: [
            "/home",
            "/home",
            "/home"
          ]
        },
        {
          header: "Navigation",
          names: [
            "Home",
            "Auto Mall",
            "FAQ",
            "My Account"
          ],
          links: [
            "/home",
            "/events",
            "/archive",
            "/viewProfile"
          ]
        }
      ],
      serviceNum: 0,
      serviceItemNum: [],
      randomText: "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab accusamus, at atque beatae deleniti dolor ducimus ex expedita, illum ipsum odit possimus quaerat rem rerum, soluta. Distinctio in ipsum sed!"
    }
  },
  created() {
    this.serviceNum = this.services.length;
    this.serviceItemNum = new Array(this.serviceNum);
    for (let i = 0; i < this.serviceNum; i++) {
      this.serviceItemNum[i] = this.services[i].links.length;
    }
    console.log(this.serviceItemNum)
  }
}
</script>

<style scoped>


* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
  background-color: white;
}

li {
  list-style: none;
}

a {
  text-decoration: none;
}

main {
  width: 100%;
}

footer {
  margin-top: 80px;
  width: 100%;
  bottom: 0;
  left: 0;
  box-shadow: rgba(0, 0, 0, 0.25) 0px 0.0625em 0.0625em, rgba(0, 0, 0, 0.25) 0px 0.125em 0.5em, rgba(255, 255, 255, 0.1) 0px 0px 0px 1px inset;
  border-radius: 20px 20px 0 0;
  transition: background 0.3s linear;
}

.container {
  /*max-width: 1400px;*/
  padding: 30px 40px;
  margin: auto;
  box-sizing: border-box;
}

.content-footer{
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 1rem;
}

.profile .logo-area {
  display: flex;
  align-items: center;
  margin-bottom: 1rem;
}

.staff-area {
  max-width: 500px;
  margin-bottom: 1.25rem;
}

.staff-area p {
  color: #828282;
  font-weight: 400;
  line-height: 28px;
  text-indent:1em
}

.social-media a{
  color: #828282;
  margin-right: 22px;
  font-size: 24px;
}

.social-media a:hover {
  color: #313131;
}

.service-area {
  display: flex;
}

.service-header {
  margin-right: 40px;
}

li.service-name {
  color: #000;
  font-weight: 600;
}

.service-header li a {
  color: #828282;
  padding-bottom: 1px;
  font-weight: 400;
}

.service-header li a:hover {
  color: #313131;
}

.service-header li {
  margin-bottom: 10px;
}

hr {
  height: 1px;
  border: none;
  background-color: #828282;
  margin-bottom: 1rem;
}

.footer-bottom {
  display: flex;
  justify-content: space-between;
  align-items: center;
  font-size: 0.875rem;
}

.copyright {
  color: #828282;
  display: flex;
  align-items: center;
}

.copyright span{
  margin-left: 8px;
  font-weight: 400;
  letter-spacing: 0.135rem;
}

.tou a{
  color: #828282;
  margin-left: 1.5rem;
}

.tou a:hover{
  color: #313131;
}

@media screen and (max-width: 768px) {
  .content-footer{
    flex-wrap: wrap;
    justify-content: left;
  }
  .service-area{
    flex-wrap: wrap;
    justify-content: left;
  }
  .service-header {
    margin-left: 0;
    margin-right: 40px;
  }
  .social-media{
    margin-bottom: 1rem;
  }
  .footer-bottom{
    flex-wrap: wrap;
    justify-content: center;
  }
}

@media screen and (max-width: 510px) {
  .service-header {
    margin-bottom: 8px;
  }
  .copyright {
    margin-bottom: 8px;
  }
}

</style>