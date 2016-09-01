utils/ 文件夹包含了整个项目中使用到的 Sass 辅助工具，这里存放着每一个全局变量、函数、混合宏和占位符。
该文件夹的经验法则是，编译后这里不应该输出任何 CSS，单纯的只是一些 Sass 辅助工具。
_variables.scss
_mixins.scss
_functions.scss
_placeholders.scss (frequently named _helpers.scss )
utils/ 文件夹也会被称为 helpers/ , sass-helpers/ 或者 sass-utils/ ，具体使用情况取决于个人喜好。