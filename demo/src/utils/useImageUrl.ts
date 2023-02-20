/**
 * @method vite  Dynamically import images
 * @params folder  name of the folder
 * @params name  name of the file
 * @params type type of the file (e.g. png/jpg/webp/gif)
 * @returns picture
 */
const useImageUrl = (folder: string = '', name: string, type: string = 'png'): string => {
    return new URL(`../assets/images/${folder}/${name}.${type}`, import.meta.url).href
}
export default useImageUrl


