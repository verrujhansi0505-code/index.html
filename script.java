let currentIndex = 0;
// Collect all starting items to navigate smoothly
const allItems = Array.from(document.querySelectorAll('.item img'));

function filterImg(category, btn) {
    document.querySelector('.btn.active').classList.remove('active');
    btn.classList.add('active');
    
    document.querySelectorAll('.item').forEach(item => {
        if (category === 'all' || item.classList.contains(category)) {
            item.style.display = "block";
        } else {
            item.style.display = "none";
        }
    });
}

function openBox(index) {
    currentIndex = index;
    document.getElementById('box-img').src = allItems[currentIndex].src;
    document.getElementById('lightbox').style.display = "flex";
}

function closeBox() {
    document.getElementById('lightbox').style.display = "none";
}

function changeImg(dir) {
    currentIndex += dir;
    if (currentIndex >= allItems.length) currentIndex = 0;
    if (currentIndex < 0) currentIndex = allItems.length - 1;
    document.getElementById('box-img').src = allItems[currentIndex].src;
}


