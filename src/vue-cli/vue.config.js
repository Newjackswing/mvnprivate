const { defineConfig } = require('@vue/cli-service')
module.exports = {
  outputDir: "../../src/main/resources/static",
  indexPath: "../../static/index.html",
  devServer: {
    proxy: "http://localhost:8080"
  },
  chainWebpack: config => {
    const svgRule = config.module.rule("svg");
    svgRule.uses.clear();
    svgRule.use("vue-svg-loader").loader("vue-svg-loader");
  }
};


// outputDir: "../src/main/resources/static",  // 빌드 타겟 디렉토리
//     devServer: {
//   proxy: {
//     '/v1': {
//       // '/v1'으로 들어오면 포트 8090(스프링 서버)로 보낸다
//       target: '<http://localhost:8090>',
//           changeOrigin: true // cross origin (CORS) 허용
//     }
//   }
// }
// module.exports = {
//   outputDir: "../src/main/resources/static",
//   indexPath: "../static/index.html",
//   devServer: {
//     proxy: "http://localhost:8080"
//   },
//   chainWebpack: config => {
//     const svgRule = config.module.rule("svg");
//     svgRule.uses.clear();
//     svgRule.use("vue-svg-loader").loader("vue-svg-loader");
//   }
// };