## install npm

## install yarn
1. curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | sudo apt-key add -

2. sudo apt-get install --no-install-recommends yarn

## create
1. sudo npm install -g create-react-kotlin-app //  sudo npm install create-react-kotlin-app yarn -g
2. create-react-kotlin-app my。-app

## test
1. npm start / yarn start

## build
1. npm build / yarn build


## 部署

1. 安装serve
npm install -g serve

2. 进入项目目录，启动
serve -s -d -n -l 5000 （5000是指定的端口号）