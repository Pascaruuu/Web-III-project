let slideIndex = 0;
showSlides();

function showSlides() {
  let i;
  let slides = document.getElementsByClassName("mySlides");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}
  slides[slideIndex-1].style.display = "block";
  setTimeout(showSlides, 2000); // Change image every 2 seconds
}


// Contact form

$(document).ready(function() {
$('#contact-form').on('submit', function(e) {
    e.preventDefault();
});

    var form_data = $(this).serialize(); // serialize the form data
    
    $.ajax({
      type: 'POST',
      url: '/addContact', // Change this to /addContac
      data: form_data
    })
    .done(function(response) {
      alert('Message sent successfully.'); // show success message
      $('#contact-form')[0].reset(); // reset the form
    })
    .fail(function() {
      alert('Error sending message. Please try again later.'); // show error message
    });
  });
});


