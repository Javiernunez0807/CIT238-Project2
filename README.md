# CIT238-Project2
 Wishlist Project for Kotlin

Submitted by: Javier A Nunez

Wishlit is an android app that shows an image and introductory message, and allows pressing a button to display a Toast. 

Time spent: **X** hours spent in total

## Required Features

The following **required** functionality is completed:

* [x] User can add item to the wishlist
       - Item should include: Name, Price, URL
* [x] User can see their list of items based on previously inputted items
       - New items should be added to a list
       - If items go past the screen's edge, the list should be scrollable

The following **optional** features are implemented:

* [ ] Wishlist app is customized
* [ ] User can delte an item by long pressing on the item
* [ ] User can open an item URL by clicking on an item

## Video Walkthrough

Here's a walkthrough of implemented features:

<img src='[http://i.imgur.com/link/to/your/gif/file.gif](https://submissions.us-east-1.linodeobjects.com/and102/lxBGiQpB.gif)' title='Video Walkthrough' width='' alt='Video Walkthrough' />


GIF created with GIPHY CAPTURE

## Notes

Describe any challenges encountered while building the app.

- The first challenge was adapting the Email clone to the wish list and seeing what was necessary.
- After completing all the code, the app would not start. After around 30 minutes, I realized that the ItemFetcher class was not necessary since there would be no default items. Once I deleted ItemFetcher.kt, the app ran normally
## License

    Copyright [2023] [Javier A Nunez]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
