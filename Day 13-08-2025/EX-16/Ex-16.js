let images = [
    "https://www.cookwithkushi.com/wp-content/uploads/2023/07/easy-juicy-gulab-jamun.jpg",
    "https://static.toiimg.com/thumb/53099699.cms?imgsize=182393&width=800&height=800",
    "https://tastyjevan.com/wp-content/uploads/2020/11/thumbnail_nt1-5.jpg?w=1568",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3UrVujj7l1Dwz7fUOGRvx1Pc87glubielmg&s"
];

let index = 0;

function showImage() {
    document.getElementById("galleryImage").src = images[index];
}

function nextImage() {
    index++;
    if (index >= images.length) {
        index = 0; 
    }
    showImage();
}

function prevImage() {
    index--;
    if (index < 0) {
        index = images.length - 1; 
    }
    showImage();
}

showImage();
