const express = require('express');
const port = 3000;
const app = express();

var jsonResponse = [
    {
        title: "Sony abandona mercado de celulares no Brasil e restante da América do Sul",
        image: "https://img.ibxk.com.br///2019/04/26/26151546161198-t1200x480.jpg"
    },
    {
        title: "Logo ali: Xiaomi Redmi 7 e Redmi Note 7 chegam ao Brasil em maio",
        image: "https://img.ibxk.com.br//2019/04/26/26115723282096-t1200x480.jpg"
    },
    {
        title: "Como funciona uma corrida de drones — e por que ela é tão empolgante",
        image: "https://img.ibxk.com.br///2019/04/25/25155549413165-t1200x480.jpg"
    },
    {
        title: "Google traz easter egg para celebrar “Vingadores: Ultimato”",
        image: "https://img.ibxk.com.br///2019/04/25/25155415988162-t1200x480.jpg"
    },
    {
        title: "Oscar: Academia mantém regra de elegibilidade que favorece Netflix",
        image: "https://img.ibxk.com.br///2019/04/25/25165151182201-t1200x480.jpg"
    }
];
app.use(express.json()) 

app.get('/', function(request, response){
    response.status(200).send(jsonResponse);
});

app.listen(port);

function delay(ms) {
  ms += new Date().getTime();
  while (new Date() < ms){}
}