// function a(){
//     // yah pahle apne lexical enviroment me check karega 
//     // nahi milega to globle space me dekhega and b ko print kr dega

//     console.log(b);

// }
// var b=10;
// a();
function a()
{
    var b=10;
    c();
    function c()
    {
     console.log(b);
    }
}
a();
//console.log(b);