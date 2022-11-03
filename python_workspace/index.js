const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => {
  res.send('<h1>Hello</h1> World!')
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})

/* node는 바뀌는게 있으면 서버 껐다 켜듯이 ctrl+c해서 끈 후에 다시 열어야함*/
/* 프론트에서 리액트나 뷰에서 서버가 필요할 때 node.js를 사용하고
    일반적으로 파이썬이 더 유명하고 많이 쓰긴함 , 둘다 exe 파일을 만들수있음
    어느 컴퓨터든 exe파일로 만들수 있어서 어디서든 돌아갈 수 있음*/