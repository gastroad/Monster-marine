const path = require("path")
const HtmlWebPackPlugin = require("html-webpack-plugin")
const CaseSensitivePathsPlugin = require("case-sensitive-paths-webpack-plugin")

module.exports = {
  entry: "./src/index.tsx",
  resolve: {
    alias: {
      "@src": path.resolve("./src"),
      "@components": path.resolve("./src/components"),
      "@containers": path.resolve("./src/containers")
    },
    extensions: [".js", ".jsx", ".ts", ".tsx"]
  },
  output: {
    path: path.resolve("./dist"),
    filename: "bundle.min.js",
    publicPath: "/"
  },
  module: {
    rules: [
      {
        test: /\.(jsx?|tsx?)$/,
        exclude: /node_modules/,
        use: {
          loader: "babel-loader"
        }
      },
      {
        test: /\.(scss|css)$/,
        use: ["style-loader", "css-loader", "sass-loader"]
      },
      {
        test: /\.(bmp|gif|jpe?g|png)$/,
        loader: "file-loader",
        options: { name: "images/[name].[hash:6].[ext]" }
      }
    ]
  },
  plugins: [
    new CaseSensitivePathsPlugin(),
    new HtmlWebPackPlugin({
      template: "./src/index.html"
    })
  ],
  devServer: {
    host: "0.0.0.0",
    port: 8080,
    disableHostCheck: true,
    historyApiFallback: true
    // proxy: {
    //   "/api": {
    //     target: "", /////////////////////////
    //     changeOrigin: true,
    //     secure: false
    //   }
    // }
  }
}
