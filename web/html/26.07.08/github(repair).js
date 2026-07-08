const avatar_url = document.getElementById("avatar_url");
const login = document.getElementById("login");
const name = document.getElementById("name");
const blog = document.getElementById("blog");
const followers = document.getElementById("followers");
const folloing = document.getElementById("folloing");
const public_repos = document.getElementById("public_repos");

const button = document.getElementById("btn");
const insertName = document.getElementById("insertName");
const msg = document.getElementById("msg");

const getinfo = async () => {
    const UserName = insertName.value;
    const url = `https://api.github.com/users/${UserName}`
    
    if(UserName == ""){
        msg.textContent = "GitHub 아이디를 입력하세요"
        return;
    }
    
    

    msg.textContent = "사용자 정보를 불러오는 중입니다."

    fetch(url)
    .then(Response => Response.json())
    .then(data => {

        if(!data.login){
            msg.textContent = "유저 데이터가 없습니다.";
            return;
        }

        const info = data.login
        msg.textContent = "";

        avatar_url.src = data.avatar_url;
        login.textContent = ("유저명 : " + data.login);

        name.textContent = data.name;
        blog.textContent = data.blog;
        followers.textContent = data.followers;
        folloing.textContent = data.folloing;
        public_repos.textContent = data.public_repos;
    })
    
}

button.addEventListener("click",getinfo);