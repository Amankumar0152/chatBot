const apiUrl = "http://localhost:8080/api/chat";

    function addMessage(text, type) {
        const box = document.getElementById("chatBox");
        const msg = document.createElement("div");
        msg.className = "message " + type;
        msg.innerText = text;
        box.appendChild(msg);
        box.scrollTop = box.scrollHeight;
    }

    async function sendMessage() {
        const input = document.getElementById("messageInput");
        const userMsg = input.value.trim();
        if (!userMsg) return;

        addMessage(userMsg, "user-message");
        input.value = "";

        try {
            const response = await fetch(apiUrl, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ message: userMsg })
            });

            const reply = await response.text();
            addMessage(reply, "bot-message");

        } catch (error) {
            addMessage("⚠️ Backend Offline! Start Spring Boot.", "bot-message");
        }
    }

    document.getElementById("messageInput")
        .addEventListener("keypress", function (e) {
            if (e.key === "Enter") sendMessage();
        });