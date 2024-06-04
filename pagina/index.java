                                // Estructura JS // 
const MAX_SROLL = 500;
const header = document.querySelector("header");

window.addEventListener("scroll", ()=>{
    if(window.scrollY > MAX_SROLL){
        header.style.backgroundColor = "rgba(0,0,0, 0.9)";
    }else{
        header.style.backgroundColor = "rgba(0,0,0,0.3)";
    }
});

const allBtnCard = document.querySelectorAll(".btn-card");
console.log(allBtnCard)
const modal = document.querySelector("#modal");
const textModal = document.querySelector("#text-modal");
const buttonModal = document.querySelector("#btn-modal");
