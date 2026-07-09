const searchbth = document.getElementById("searchBtn");
const allBtn = document.getElementById("allBtn");
const message = document.getElementById("message");
const productList = document.getElementById("productList");
const count = document.getElementById("count");

function loadProducts() {
  message.innerHTML = '<div class="message">상품 정보를 불러오는 중입니다.</div>';
  const url = `https://dummyjson.com/products`;

  fetch(url)
    .then(res => res.json())
    .then(data => {
      // 1. 기존 리스트 초기화
      productList.innerHTML = ''; 

      // 2. data.products 배열을 forEach로 반복
      data.products.forEach(product => {
        productList.innerHTML += `
          <div class="product-card"> 
            <img src="${product.thumbnail}" alt="${product.title}"> 
            <p><strong>${product.title}</strong></p> 
            <p><strong>카테고리 : </strong>${product.category}</p> 
            <p><strong>가격 : </strong>$${product.price}</p> 
            <p><strong>할인율 : </strong>${product.discountPercentage}%</p> 
            <p><strong>평점 : </strong>${product.rating}</p> 
            <p><strong>재고 : </strong>${product.stock}개</p> 
          </div>`;
      });

      // 3. 총 상품 개수 표시 (dummyjson API는 data.total에 총 개수를 담아줍니다)
      count.innerText = data.total; 
      
      // 로딩 메시지 지우기 (선택 사항)
      message.innerHTML = '';
    })
    .catch(err => {
      message.innerHTML = '<div class="message">데이터를 불러오지 못했습니다.</div>';
      console.error(err);
    });
}


        loadProducts();

        