var nic = document.getElementsByClassName('formulario__input'); 
for(var i = 0; i< nic.length; i++) {
    nic[i].addEventListener('keyup', function(){
        if(this.value.length>=1){
            this.nextElementSibling.classList.add('fijar');
        }else{
            this.nextElementSibling.classList.remove('fijar');
        }
    });
}

/*var fec = document.getElementsByClassName('formulario__fecha'); 
    fec[i].addEventListener('onclick', function(){
for(var i = 0; i< fec.length; i++) {
        if(this.value.length>=1){
            this.nextElementSibling.classList.add('fijar_fecha');
        }else{
            this.nextElementSibling.classList.remove('fijar_fecha');
        }
    });
}*/



