// Varijable
const imageBox = document.querySelector(".image-box");
const singleImage = document.querySelector(".single-image");
const textArea = document.querySelector(".text-area");
const SelectedBox = document.querySelector(".selected-box");

// Start 
for (let i = 0; i < imageBox.childElementCount; i++) {

	imageBox.children[i].addEventListener("click", () => {

		
		
		
		let firstImageInBox = singleImage.children[0];
		let secondImageBox = singleImage.children[1];
		let box = imageBox.children[i];

		if(singleImage.contains(firstImageInBox)){
			singleImage.removeChild(firstImageInBox);
		}

		if (singleImage.contains(secondImageBox)) {
			singleImage.removeChild(secondImageBox);
		}
		
		
		
		
		let boxes = textArea.children[i];
		let img = document.createElement("img");
		let selectBox = SelectedBox.children[0];
		
		
		
		let button = document.createElement("button");
		button.innerHTML = "<i class='fas fa-backspace fa-2x'></i>";
		
		img.src = box.src;
		img.alt = box.alt;
		singleImage.appendChild(img);
		singleImage.appendChild(button);
		

		
		if(SelectedBox.contains(selectBox)){
			SelectedBox.removeChild(selectBox);
		}

		
		let clone = boxes.cloneNode(true);
		SelectedBox.appendChild(clone);
		clone.style.display = "block";

		
		button.addEventListener("click", () => {
			location.reload();
		});
	});
}
