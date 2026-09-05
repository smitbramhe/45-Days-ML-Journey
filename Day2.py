# =========================================================IMAGE NORMALIZATION USING BRODCASTING========================================================
import numpy as np
raw_pixels = np.array([
    [120, 255, 0],
    [50, 200, 100],
    [10, 20, 30]
])
print("Raw Image Data 0 to 255: \n", raw_pixels)
print("="*50)

normalized_pixels = raw_pixels/255
print("Normalized Image Data: \n", normalized_pixels)
print("="*50)


# =========================================================IMAGE BRIGHTNESS USING BRODCASTING===================================================
#import numpy as np
dark_image_pixels = np.arange(30,111,10).reshape(3,3)
print("Original Dark Image: \n",dark_image_pixels)
print("="*50)

bright_image_pixels = dark_image_pixels + 50
print("Brightend image: \n",bright_image_pixels)